import logo from './logo.svg';
import './App.css';
import Greet  from './components/Greet'
import Welcome from './components/Welcome';
import Hello from './components/Hello';
import Message from './components/Message';
import Counter from './components/Counter';

function App() {
  return (
    <div className="App">
    <Counter/>
      {/* <Message  /> */}
      {/* <Greet/>
      <Welcome/> */}
      {/* <Hello name="Ashraf"/> */}
      {/* <Greet  name="Ashraf" heroName="Batman">
       <p>This is children props</p>
      </Greet>
      <Greet  name="Ashraf1" heroName="Superman">
      <button>Click Me !</button>
      </Greet>
      <Greet  name="Ashraf2" heroName="Spiderman"/>
      <Welcome name="Ashraf" heroName="Batman"/>
      <Welcome name="Ashraf1" heroName="Superman"/>
      <Welcome name="Ashraf2" heroName="Spiderman"/> */}
    </div>
  );
}

export default App;
