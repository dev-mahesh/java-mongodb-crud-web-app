$(document).ready(function(){

	var table=$("#tblstudent");
		$.ajax({
			method:"Post",
			url:"GetAllStudentData",
			success:function(data)
			{
				$("#row ").remove();
				$.each(data,function(key,value){
					table.append('<tr id="row1"><td id="rollno">'+value.rollno+'</td><td id="name">'+value.name+'</td><td id="depart">'+value.depart+'</td><td id="sub1">'+value.sub1+'</td><td id="sub2">'+value.sub2+'</td><td id="sub3">'+value.sub3+'</td></tr>');
					})
			}
	})
});
