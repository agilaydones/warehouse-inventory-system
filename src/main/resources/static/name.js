let getUrl = "http://localhost:9595/product/all";


///Get Function Ajax Control
function tablePop(url, callback){
	let xhr = new XMLHttpRequest();
	xhr.open("GET", url);
	xhr.onreadystatechange = function(){
		if(this.readyState===4 && this.status===200){
			callback(this);
			//console.log(this);
		}else{
			console.log(xhr.response);
		}
	}
	xhr.send();
}
//This will populate my table
 function Pop (xhr){
	let productArr = xhr.response;
	let parsedProdArr = JSON.parse(productArr);
	console.log(parsedProdArr);
			for(product of parsedProdArr){
			addRow(product.id, product.name, product.price, product.quantity, product.warehouse.name, product.warehouse.id);
		}
	}
function addRow(id, name, price, quantity, warehouse){
	let row = document.createElement("tr");
	let cell1 = document.createElement("td");
	let cell2 = document.createElement("td");
	let cell3 = document.createElement("td");
	let cell4 = document.createElement("td");
	let cell5 = document.createElement("td");

	
	
	row.appendChild(cell1);
	row.appendChild(cell2);
	row.appendChild(cell3);
	row.appendChild(cell4);
	row.appendChild(cell5);
	
	
	cell1.innerHTML=id;
	cell2.innerHTML=name;
	cell3.innerHTML=price;
	cell4.innerHTML=quantity;
	cell5.innerHTML=warehouse;
	
	
	document.getElementById("pTable").appendChild(row);
	
}
//The table will be loaded in on window onload
window.onload = function testData(){
	tablePop(getUrl,Pop);
	
}
	
 


