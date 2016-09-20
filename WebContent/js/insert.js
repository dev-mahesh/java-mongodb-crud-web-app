$(document).ready(function(){
	
	function cleartxt() {
		$("#rollno").val('');
		$("#name").val('');
		$("#depart").val('');
		$("#sub1").val('');
		$("#sub2").val('');
		$("#sub3").val('');
	}

	$("#btnsave").click(function(){
		
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
				url:"AddStudent",
				data:{
					studentdata:dataJSON
				},
				success:function(data)
				{
					alert("Student Inserted Successfully");
					cleartxt();
				}
			})
					
	})
})