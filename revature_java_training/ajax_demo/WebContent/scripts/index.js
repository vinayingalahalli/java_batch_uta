function getAllUsers(){

let xhr= new XMLHttpRequest;
xhr.open('GET','https://api.github.com/users',true);
var data="";
xhr.onload=function(){
    if(this.readyState==4 && this.status==200){
        //console.log(this.responseText);
        let res=JSON.parse(this.responseText);
        data="<table ><tr><th>Login Name</th></tr>"
        res.forEach(element => {
           data=data+"<tr><td>"+element.login+"</td></tr>"; 
           data=data+"<tr><td><img height=100 width=100 src='"+element.avatar_url+"'/></tr></td>";
        });
        data=data+"</table>"
        document.getElementById("users").innerHTML=data;
    }
}

xhr.send();
  
}


function getUserById(){
    let id=document.getElementById("userid").value;
    let xhr= new XMLHttpRequest;
xhr.open('GET','https://api.github.com/users/'+id,true);
var data="";
xhr.onload=function(){
    if(this.readyState==4 && this.status==200){
        //console.log(this.responseText);
        let res=JSON.parse(this.responseText);
        data="<table ><tr><th>Login Name</th></tr>"
       // res.forEach(element => {
           data=data+"<tr><td>"+res.login+"</td></tr>"; 
           data=data+"<tr><td><img height=100 width=100 src='"+res.avatar_url+"'/></tr></td>";
     //   });
        data=data+"</table>"
        document.getElementById("users").innerHTML=data;
    }
}

xhr.send();
  

}