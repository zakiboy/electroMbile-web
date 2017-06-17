$(function(){
	//全选 
	$("#checkAll").click(function(){
		$("input[name='rulebox']").prop("checked","true");
	});
	//取消全选 
	$("#cancelCheckAll").click(function(){
		$("input[name='rulebox']").removeAttr("checked");
	});
	//反选 
	$("#invertSelection").click(function(){
		$("input[name='rulebox']").each(function(){
			if($(this).prop("checked")){
				$(this).removeAttr("checked");
			}else{
				$(this).prop("checked","true");
			}
		});
	});
	//选中父级下的子菜单
	$('input').click(function(){  
		if($(this).prop('checked')==true){  
			$(this).parents('li').children('div').children('input').prop('checked','true');//上一级被选中或上上一级  
			$(this).closest('li').find('input').prop('checked','true');  
		}else{  
			$(this).closest('li').find('input').removeAttr('checked');  
		}  
	}); 
	//保存
	$("#save").click(function(){
		var menuStr="";
		$("input[name='rulebox']:checkbox:checked").each(function(){
			menuStr+=$(this).val()+",";
		});
		$('#menuStr').val(menuStr);
	});
	//取消
	$("#cancel").click(function(){
		$("input[name='rulebox']").each(function(){
			if($(this).prop("checked")){
				$(this).removeAttr("checked");
			}
		});
		$('#subUserMnStr').val("");
	});

	$("#verify").click(function(){
		var str = $('#menuStr').val();
		if ( str == "" || null == str) {
			$("#alert").click();
			return false;
		}

	});
});