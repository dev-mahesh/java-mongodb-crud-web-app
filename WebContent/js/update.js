$(document).ready(function(){

	 var inputdata=$("#rollno").val();
	 function cleartxt() {
			$("#rollno").val('');
			$("#name").val('');
			$("#depart").val('');
			$("#sub1").val('');
			$("#sub2").val('');
			$("#sub3").val('');
		}
	 
	$("#btnsearch").click(function(){
		if (inputdata=="") {
		var input=$("#rollno").val(); 
	
		$.ajax({
			method:"Post",
			url:"SearchStudent",
			data:{
				rollno:input,
			},
			success:function(data)
			{
				$.each(data,function(key,value){
					$("#name").val(value.name);
					$("#depart").val(value.depart);
					$("#sub1").val(value.sub1);
					$("#sub2").val(value.sub2);
					$("#sub3").val(value.sub3);
					})
			}
		})
		}
		else
			{
			alert("Please Enter Correct Rollno..!");
			}
	})
	
	$("#btnUpdate").click(function(){
		
		var rollno=$("#rollno").val();
		var name=$("#name").val();
		var depart=$("#depart").val();
		var sub1=$("#sub1").val();
		var sub2=$("#sub2").val();
		var sub3=$("#sub3").val();
		
		var jsonData=new Object();
		
		jsonData.rollno=rollno;
		jsonData.name=name;
		jsonData.depart=depart;
		jsonData.sub1=sub1;
		jsonData.sub2=sub2;
		jsonData.sub3=sub3;

		var dataJSON=JSON.stringify(jsonData);
		$.ajax({
			method:"GET",
			url:"UpdateStudent",
			data:{
				studentdata:dataJSON
			},
			success:function(data)
			{
				alert("Student Updated Successfully");
				cleartxt();
			}
		})
	})
	
});
