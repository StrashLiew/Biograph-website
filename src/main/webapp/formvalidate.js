/**
 * 
 */
 
 function contactValidate(){
	let name=document.getElementById("name").value;
	let email=document.getElementById("email").value;
	let message=document.getElementById("message").value;
	
	let text;
	var validName = /^[a-zA-Z]+ [a-zA-Z]+$/;
	var validEmail = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
	if(!validName.test(name)||name===""){		
		text ="Please enter a VALID name";
		alert(text);
		return false;
	}
	if(email.indexOf("@") == -1 || !validEmail.test(email)){		
		text ="Please enter a VALID email";
		alert(text);
		return false;
	}
	if(message.length<5){		
		text ="Please enter more than 5 characters";
		alert(text);
		return false;
	}
	
	alert("Your comment submitted successfully");
	return true;
	
}