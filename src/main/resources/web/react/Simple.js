
// stateful component
class Simple extends ReactComponent{
    work(){
        alert("Good work");
    }
    render(){
        return(
            <button onClick={this.work}>Do some work</button>
        );
    }
}

// stateless component
function ClickFunction(){
    function handleClick(e){
        e.priventDefault();
        console.log("You just clicked");
    }

    return (<button onClick={handleClick}>Click here</button>);
}

-----------------------------------

const names=['patnana','asiri','naidu'];

const listOfNames=()=>{
    const listItems=names.map((name)=>
        <li key={name}>{name}</li>
    );

    return(
        <ul>{listItems}</ul>
    );
}
-------------------------------
# form component

class NameForm extends React.Component{
    this.state={value:''};

    handleChange(event){
        this.setState({value:event.target.value});
    }

    handleSubmit(event){
        alert('Name value entered :'+this.state.value);
        event.preventDefault();
    }

    render(){
        return (
            <form onSubmit={this.handleSubmit.bind(this)}>
                <label>Name:
                <input type="text" value={this.state.value} onChange={this.handleChange.bind(this)}/>
                </label>
                <input type="submit" value="Submit"/>
            </form>
        );
    }
}
export default NameForm;
---------------
# Arrow function in react
An arrow function is a short way writing function in react

#without arrow function
render(){
    return(
        <MyInput onChange={this.handleOnChange.bind(this)}/>
    );
}

#with arrow function
render(){
    return(
        <MyName onChange={(e)=>handleOnchange(e)}/>
    );
}
-------------------
class App extends React.Component{
    constructor(props){
        super(props);
        this.state={car:'Taigun',bike:'FZ 25'};
    }

    render(){
        return (
            <div>
                <h4> My car is {this.state.car}</h4>
                <h4> My bike is {this.state.bike}</h4>
            </div>
        );
    }
}
export default App;
----------------------------
