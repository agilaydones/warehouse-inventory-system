let putUrl = "http://localhost:9595/product";
let gUrl = "http://localhost:9595/product/all";



function display(url, callback){
	let xhr = new XMLHttpRequest();
	xhr.open("GET", url);
	xhr.onreadystatechange = function(){
		if(this.readyState===4 && this.status===200){
			callback(this);
			console.log(this);
		}else{
			console.log(xhr.response);
		}
	}
	xhr.send();
}

function pick(){
	display(gUrl,Link);
}


function Link(xhr){
	let products = JSON.parse(xhr.response);
	let delI = document.getElementById("delDext");
	let e = document.getElementById("putsel");
	let num = e.options[e.selectedIndex].text-1;
	for(product of products){
		var sel =document.getElementById("putsel").value
		if(sel ==  product.id){
			let num = e.options[e.selectedIndex].text-2;
			//let num = e.options[e.selectedIndex].text-2;
			document.getElementById("prod").innerHTML = `Product ID:  ${product.id}   Selected Product: ${product.name}  At Warehouse: ${product.warehouse.name}`;
			document.getElementById("wareAd").value = product.warehouse.address;
			document.getElementById("wareName").value = product.warehouse.name;
			}
		console.log("ERROR");
		}
	}
//	if(num>=delI){
//	let num = e.options[e.selectedIndex].text-2;
//document.getElementById("prod").innerHTML = `Product Index:${products[num].id}   Selected Product: ${products[num].name} , At Warehouse: ${products[num].warehouse.name}`;
//document.getElementById("wareAd").value = products[num].warehouse.address;
//	document.getElementById("wareName").value = products[num].warehouse.name;
//	console.log(num+"HIII");
//	}else{ 
//		document.getElementById("prod").innerHTML = `Product Index:${products[num].id}   Selected Product: ${products[num].name} , At Warehouse: ${products[num].warehouse.name}`;
//		console.log(num+"NOOO");
//		document.getElementById("wareAd").value = products[num].warehouse.address
//		document.getElementById("wareName").value = products[num].warehouse.name
//		}
//	}
	


function show (xhr){		
	let products = JSON.parse(xhr.response);
	//console.log(product);
		for(product of products){
			addOption(product.id);
		}
		
	
}
function addOption(id,name){
	let option = document.createElement("option");
	option.text= id;
	option.value = id;
	document.getElementById("putsel").appendChild(option);
	//document.getElementById("delsel").appendChild(option);

}


document.getElementById("putsel").addEventListener("change",pick);



window.onload = function test(){
	display(gUrl,show);
}

function UpdateAProduct(url, callback, updateProduct){
	let xhr = new XMLHttpRequest();
	xhr.open("PUT",url);
	xhr.onreadystatechange = function(){
		if(xhr.readyState === 4 && xhr.status===201){
			callback(this);
		}else{
			console.log(xhr.response);
		}
	}
	xhr.setRequestHeader("Content-Type","application/json");
	let jsonProd = JSON.stringify(updateProduct);
	console.log(jsonProd);
	xhr.send(jsonProd);
}
function printResponse(xhrObj){
	console.log(xhrObj.response);
}
function UpdateExistingProduct(){
	let selectedWarehouse ={
			"warehouse":{
				"address":document.getElementById("wareAd").value,
				"id": document.getElementById("putsel").value,
				"name":document.getElementById("wareName").value
			},
			"address":document.getElementById("wareAd").value,
			"id": document.getElementById("putsel").value,
			"name":document.getElementById("wareName").value
				
	};
	let newPut={
			"id": document.getElementById("putsel").value,
			"name": document.getElementById("prodPutName").value,
			"price":document.getElementById("prodPutPrice").value,
			"quantity": document.getElementById("prodPutQuantity").value,
			"warehouse":selectedWarehouse 
			}
	console.log(newPut);
	UpdateAProduct(putUrl,printResponse,newPut);
}
document.getElementById("putButton").addEventListener("click",UpdateExistingProduct);
	
