package com.ct.junit;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class modbustest2 {
	public static void main(String argv[]) throws InterruptedException{
		//String argv[] = new String[4];
		argv[0] = "192.168.0.144";
		argv[1] = "1";
		argv[2] = "27";
		argv[3] = "1";
		
		if (argv.length < 4) {

			System.out.println("usage: java test3 dns_name unit reg_no num_regs");

			System.out.println("eg java test3 aswales8.modicon.com 5 0 10");

			return;
		}

		try {

			String ip_adrs = argv[0];					// IP地址

			int unit = Integer.parseInt(argv[1]);		// 从站地址 slave Address 

			int reg_no = Integer.parseInt(argv[2]);		// 寄存器起始地址

			int num_regs = Integer.parseInt(argv[3]);	// 寄存器个数

			System.out.println("ip_adrs = "+ip_adrs+" unit = "+unit+" reg_no = "+

					reg_no+" num_regs = "+num_regs);

			// set up socket

			Socket es = new Socket(ip_adrs,502);

			OutputStream os= es.getOutputStream();

			FilterInputStream is = new BufferedInputStream(es.getInputStream());

			byte obuf[] = new byte[261];

			byte ibuf[] = new byte[261];


			int c = 0;

			int i;

			// build request of form 0 0 0 0 0 6 ui 3 rr rr nn nn	// modbus TCP/IP
			
			// 0 0 0 0 0 6 此6个字节为头字节（header handle）
			// 0 0 前2个字节是client发出的校验信息，从站接到后将此2个字节内容copy以后再放到response的报文的相应位置就可以。
			// 0 0 中间2个字节表示tcp/ip协议的modbus协议。
			// 0 6 后2个字节表示header handle之后还有多长字节，即表示该字节之后的字节长度，可以看到在0 6 之后还有“ui 3 rr rr nn nn”6个字节长度，所以这2个字节表示的就是6
			for (i=0;i<5;i++) obuf[i] = 0;
			
			obuf[5] = 6;
			// ----------------------------------------
			
			// ui 为一个字节表示 slave Address
			obuf[6] = (byte)unit;

			// 3 为Function Code
			obuf[7] = 3;

			// 寄存器地址高8位
			obuf[8] = (byte)(reg_no >> 8);

			// 寄存器地址低8位
			obuf[9] = (byte)(reg_no & 0xff);

			// 寄存器个数高8位
			obuf[10] = (byte)(num_regs >> 8);

			// 寄存器个数低8位
			obuf[11] = (byte)(num_regs & 0xff);

			// send request

			os.write(obuf, 0, 12);

			// read response

			i = is.read(ibuf, 0, 261);

			if (i<9) {

				if (i==0) {

					System.out.println("unexpected close of connection at remote end");

				} else {

					System.out.println("response was too short - "+i+" chars");

				}
			}else if (0 != (ibuf[7] & 0x80)) {

				System.out.println("Modbus?exception response - type "+ibuf[8]);

			} else if (i != (9+2*num_regs)) {

				System.out.println("incorrect response size is "+i+" expected "+(9+2*num_regs));

			} else {

				for (i=0;i<num_regs;i++) {

					int w = (ibuf[9+i+i]<<8) + ibuf[10+i+i];

					System.out.println("word "+i+" = "+w);

					// close down

					es.close();

				}
			}
				
		}catch (Exception e) {

			System.out.println("exception :"+e);
		}
	}
}
