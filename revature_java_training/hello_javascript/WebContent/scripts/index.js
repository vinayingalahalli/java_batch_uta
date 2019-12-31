console.log("Hello console")
document.write("<h1>hello from JS</h1>")
document.write("<h1>hello from JS again</h1>")

function hello(){
	var x=document.getElementById("name").value;
	//try with checkbox, dropdown, radio
	var message="";
	if(x=="" || x.length==0){
		message="Name cannot  be empty";
	}else{
	alert("Hello "+x)
	document.getElementById("body").style.background="blue"
	}
	document.getElementById("error").innerText=message;
	//document.write("<h1>hello from function</h1>") wipes out all the content.. dont use
}


function validate(){
	var x=document.getElementById("username").value;
	var message="";
	var flag=false;
	if(x=="" || x.length==0){
		message="Name cannot  be empty";
	}else{
		flag=true;
	}
	document.getElementById("errorUsername").innerText=message;
	//alert("message = "+message)
	return flag;
}



/*
 *document.getElementById("id"); 1 value
 *document.getElementsByName(""); []
 *document.getElementsByTagName("p");[]
 *
 *form fields(checkbox, text,textarea)
 *.value
 *tags(p,div,span)
 *.innerText .innerHTML
 *
 *css
 *.style
 */
