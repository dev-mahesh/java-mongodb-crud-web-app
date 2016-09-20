$(document).ready(function(){

	 var inputdata=$("#rollno").val();
	
	$("#btndelete").click(function(){
		if (inputdata=="") {
		$("#tblstudent td").remove();
		var input=$("#rollno").val(); 
	var table=$("#tblstudent");
	
		$.ajax({
			method:"Post",
			url:"DeleteStudent",
			data:{
				rollno:input,
			},
			success:function(data)
			{
				alert("Successully Removed Data..!");
			}
		})
		}
		else
			{
			alert("Please Enter Correct Rollno..!");
			}
	})
	
});
