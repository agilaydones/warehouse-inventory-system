let postUrl = "http://localhost:9595/product"; 

//Post functionAJax Control
function postNewProduct(url, callback, sendProduct){
	let xhr = new XMLHttpRequest();
	xhr.open("POST",url);
	xhr.onreadystatechange = function(){
	if(xhr.readyState===4 && xhr.status===201){
		callback(this);
	}else{
		console.log(xhr.response);
	}
}	
xhr.setRequestHeader("Content-Type","application/json");
let jsonProds = JSON.stringify(sendProduct);
console.log(jsonProds);
xhr.send(jsonProds);
}
function printResponse(xhrObj){
	console.log(xhrObj.response);
}
function PostMyNewProduct(){
	let newWarehouse = {
			"warehouse":{
				"address": document.getElementById("warehouseAddress").value,
				"id": document.getElementById("warehouseId").value,
				"name": document.getElementById("warehouseName").value
			},
			"address": document.getElementById("warehouseAddress").value,
			"id": document.getElementById("warehouseId").value, 
			"name": document.getElementById("warehouseName").value,
	};
	let newProduct = {
			"id": document.getElementById("id").value,
			"name":  document.getElementById("name").value,
			"price": document.getElementById("price").value,
			"quantity": document.getElementById("quantity").value,
			"warehouse": newWarehouse
			}
	console.log(newProduct);

	postNewProduct(postUrl,printResponse,newProduct);
	}
	//prodButton is the event button for the post
	document.getElementById("prodButton").addEventListener("click",PostMyNewProduct);

	
	
	
	