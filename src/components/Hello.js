import React from "react";


const Hello =()  =>{

   //  return(
     //  <div>
       // <h1>Bismillah, Let's Begin</h1>
       //</div>
       //)
       //above code is with using jsx, and below code is without jsx using react

       //return React.createElement('div',null,'h1','Hello Ashraf</h1>')

       //below code withoput id for div tag
       //return React.createElement(
        //'div',
        //null,
        //React.createElement('h1', null,'Hello Ashraf'))

       // return React.createElement(
         //   'div',
           // {id:'hello', class :'dummyClass'},
            //React.createElement('h1', null,'Hello Ashraf'))
    // here class is used which is used to create react classes but not css class so in react we have to use classname for class as below.

    return React.createElement(
           'div',
           {id:'hello', className :'dummyClass'},
           React.createElement('h1', null,'Hello Ashraf'))
     
}

export default  Hello