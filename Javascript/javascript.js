/*
console.log("Log");
console.error("Error");
console.warn("Warn");
*/
/*
const prompt = require("prompt-sync")()
const text=prompt("Enter the prompt: ")
console.log(`You Entered: ${text}`)
*/
/*
Data Types
string - ' ' " " ` `
boolean - true false
number - 2 9.0 0 -1
undefined - if you use an uninitialized value
null - explicitly set to null absense of value
*/
/*
let a;
console.log(a)
a=null
console.log(a)
*/
/*
var x='hello' //Global scope
x="hello"
let y='hi' //block scope
y='world'
const a = 'const' //block scope
a='consts' //not possible
*/
/*
if (true) {
    var x=3;
}
console.log(x); // This is only done with var can be accessed anywhere and also can be accessed before initialization
//there its value will be undefined 
*/
/*
const x=6
const y="213"
console.log(x+y) //return 6213 for + for other operators it will convert "213" into string (Very wierd convertions are there) 
//if it cant to anything like converting "hello" into string it return NaN
//you can manually convert using Number(<value>),String(<value>)
*/
/*
== //(loose equality) it will try to convert the value 
=== //(strict equality) it will check value and also type (Recommended to use most)
*/
/*
console.log("hello"||true) //Try to avoid values other that boolean inside comparsion it will return wierd results 
*/
/*
//Array
const arr = [1,23,true] //array can be anydata type and even if it is const it can be changed but the variable cannot be reassigned
arr[0] = "changed" //value can be changed
const arr = new Array(<size>) //new empty array
const arr = Array.from(<iteratable>) //Create array from iteratable ex. it "hello" given means ['h','e','l','l','o']
array.length //to get array length
//If we have assigned an variable at out of index in array it will actually assign and till that element empty values will assigned
array.push(<element>) //New element is pushed
array.pop() //Pops and return last element
array.shift() //Removes first element
array.unshift(<element>) //Adds the element in first
array.indexOf(<value>) //Returns index value of fist occurance
array.lastIndexOf(<value>) //Returns last index of that value
array.includes(<element>) //Checks if the element is present or not
array.concat(array2) //Concat 2 arrays
array.join("values like |") //Separeter value in array
array.slice(<start>,<stop>) //Slices the array and return it
array.splice(<start_index>,<number_of_elements_from_start) //Removes the elements from original and returns it
*/
/*
const [a,b]=[1,2] //Destructing the array
console.log(a,b)
const [a,...b]=[1,2,7,5,8] //... spreading operator will collects the remaining elements and store it in b
console.log(a,b)
*/
/*
const x=[1,2,3,4]
const y=x //will refer to same object changes will affect both
const y=[...x] //create new copy
*/
/*
//For for,while,do while loops syntax is same but For for loop use let For i
const arr[1,2,3]
for(let i of arr) //Like For each loop
{console.log(i)}

const arr[1,2,3]
for(let [i,val] of arr.entries()) //For getting index with value
console.log(i,val)}
*/
/*
//Objects
const obj={
    name:"Jeeva K S",
    age:20,
    sayHello: function(){
        return "Hello"
    },
    career:{
        job:"Student"
    }
}
obj.name; //to access value
obj["name"]; //to access value
obj.newProp=[1,2]; //to set new properties
delete obj.career //to delete the property 
console.log(Object.values(obj)); //to display all values of the properties
console.log(Object.keys(obj)); //to display all keys the properties
for (let key in obj){ //to print out all keys
    console.log(key)
}
const obj2={
    haircolor:"black",
    arr:[1,2,3],
    name:"Tim" 
}
const obj3={...obj,...obj2};//If both have same porperty it only takes last one
//If the values of the obj stored in obj like here career,array are changed
//it will reflect in all place cuz they store the reference but that is not for primitive datas
console.log(obj3);
const {haircolor,name}=obj3 //Object destructoring only required with same name is got
console.log(haircolor,name);
*/
/*
//Set
const mySet = new Set([1,2,3]); //to create new map
mySet.add(4); //to add an value
mySet.delete(4); //to delete an value
mySet.has(4); //to check existence of the set
mySet.size //to get the size of the set
mySet.clear() //to clear the set
console.log(mySet);
for(const value of mySet){
    console.log(value);
}
const array = Array.from(mySet) //or [...mySet] // to convert set into an array
*/
/*
//Maps
const myMap = new Map(); //to create empty map
myMap.set(1,'one') //to add values
const numberMap = new Map([[1,'one'],[2,'two']]);
myMap.delete(1); //to delete element
myMap.get(1); //to get element
myMap.has(1); //to check element
myMap.size; //to get size
console.log(myMap);
myMap.values(); //to get values
myMap.keys(); //to get keys
for(const [key,value] of myMap){
    console.log(`Key=${key} value=${value}`);
}
myMap.clear() //to clear the map
const array = Array.from(myMap) //to convert map into array it will give nested list with keys and values
*/
/*
//Error handling
try{
    riskyfunction(); //your try code goes here
}
catch(error){
    console.error("An Error Occured! , ",error.message); //only run if error is catched
}
finally{
    console.log("Cleanup code goes here") //Always run
}
throw Error("This is custom error") //to create an custom error 
*/
/*
//Functions
function greet(name,age=20){   //simple function
    console.log("Welcome "+name);
}
greet("Jeeva K S");
const greet1 = function(name){ //another way to declare
     console.log("Welcome "+name);
}

const greet3 = (name) =>{  //Arrow function  
     console.log("Welcome "+name);
}
greet4 = () =>{ //Anoter way for arrow function
    console.log("Hi bro")
}
const test =(name) => name + "!";  //one liner for arrow function
const func2=()=>{ //Function returns function
        console.log("Inside function");
    return ()=>{
        console.log("Nested function");
    }
}
func2()(); //Two () are used
function addNum(...numbers){ //Accespt various number of arguments
}

//Array Functions 
const numbers=[1,2,3,4,5];
const  doubled=numbers.map((num)=>num*2); //Apply an function to each element and return new modified array
console.log(doubled); //[2,4,6,8,10]

const sum = numbers.reduce((accumulator,num)=>accumulator+num,0); //Used to Reduce an Array to an single values (accumulator-> store or accumulate value,
//num-> current value)
console.log(sum); //[15]

const evenNumbers=numbers.filter(num=>num%2===0); //Match an criteria the applying func should return true or false (true keep the element,false discard)
console.log(evenNumbers); //[2,4]

//Arrow func vs normal 
//Both are more over same but differ in this keyword
const person={
    name:"Alice",
    greet:function(){
        console.log(`Hello ${this.name}`); //Here this refers to the calling instance 
    }
}
person.greet(); //Value is Alice
const person1={
    name:"Alice",
    greet:()=>{
        console.log(`Hello ${this.name}`); //Here this refers to the global scope at the time of declaration so value is Undefined
    }
}
person1.greet(); //Value is Undefined
*/
/*
//Promises
//A Promise is a way to handle an operation that might take time to complete. It allows you to write code that can
//handle the results of the operation when it's finished, even if the operation hasn't finished yet. This makes it easier to work with asynchronous code, 
//because you don't have to wait for the operation to finish before you can do something else.

//EX.1
const myPromise = new Promise((resolve,reject)=>{
    if(true){
        resolve("good"); //Fulfill the promise
    }
    else{
        reject("bad"); //Reject the promise
    }
});
myPromise.then((value)=>{ //It get to then if it resolve
    console.log(value);
}).catch((value)=>{ //It get to catch if it reject
    console.log(value);
})

//EX.2
//It can run all these in parallel
const promise1=Promise.resolve(1);
const promise2=new Promise((resolve,reject)=>setTimeout(resolve,100,"foo"));
const promise3=new Promise((resolve,reject)=>setTimeout(resolve,500,"bar")); //If reject is gave instead of reolve the catch will execute and bar printed
Promise.all([promise1,promise2,promise3])
.then((results)=>{
    console.log(results);
})
.catch((error)=>{
    console.log(error)
})
*/
