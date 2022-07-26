import React from 'react'


//function Greet(){

//    return <h1>Bismillah</h1>
//}

//const Greet = ()=> <h1>Bismillahirehmani rahim</h1>
const Greet = (props)=> 
 {   
    console.log(props)
    return(
      <div>
       <h1>Bismillahirehmani rahim  {props.name}  urf {props.heroName}</h1>
       {props.children}
       </div>
    )
 }
 export default Greet


//this is named export export const Greet = ()=> <h1>Bismillahirehmani rahim</h1>
