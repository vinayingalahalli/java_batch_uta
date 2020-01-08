function validateUser(){
	let userid=document.getElementById("userid").value;
	let userpassword=document.getElementById("userpassword").value;
	var message="";
	var flag=true;
	if(userid=="" || userid.length!=6){
		message="Invalid Username";
		flag=false;
	}
	if(flag==true){
		if(userpassword==""){
			message="Invalid Password";
			flag=false;
		}
	}
	document.getElementById("errorMessage").innerText=message;
	return flag
	
}