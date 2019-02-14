let deleteUrl = "http://localhost:9595/product";
var num = 0;

function deleteOldProduct(url, callback, deleteProduct){
	let xhr = new XMLHttpRequest();
	xhr.open("DELETE",url);
	xhr.onreadystatechange = function(){
		if(xhr.readyState ===4 && xhr.status===201){
			callback(this);
		}else{
			console.log(xhr.response);
		}
	}
	xhr.setRequestHeader("Content-Type","application/json");
	let jsonProduct = JSON.stringify(deleteProduct);
	console.log(jsonProduct);
	xhr.send(jsonProduct);
}

function printResponse(xhrObj){
	cosole.log(xhrObj.response);
}

function deleteIndex(url, callback){
	let xhr = new XMLHttpRequest();
	xhr.open("GET",url);
	xhr.onreadystatechange = function(){
		if(this.readyState === 4 && this.status===200){
			callback(this);
			
		}else{
			console.log(xhr.response);
		}
	}
	xhr.send();
}



function DeleteMyOldProduct(){
	let selectedWarehouse={
			"warehouse":{
				"address": "place",
				"id": document.getElementById("putsel").value,
				"name":"warehouse"
			},
			"address": "place",
			"id": document.getElementById("putsel").value,
			"name": "warehouse"
	};
	let newDelete = {
			"id": document.getElementById("putsel").value,
			"name": "apples",
			"price": 15,
			"quantity": 15,
			"warehouse": selectedWarehouse
	}
	console.log(newDelete);
	deleteOldProduct(deleteUrl,printResponse,newDelete);
	var val =document.getElementById("putsel").value;
	document.getElementById("delDext").innerHTML = val;
	console.log(val);
	 
	
	
//	let delI = 15
//	for(delI; delI < 25;delI++){
//		num = num-1;
	}


document.getElementById("deleteButton").addEventListener("click",DeleteMyOldProduct);

