import javax.xml.soap.Node;
/**
 * Stack
 * Author: Brandon Malley
 * Collaborator:
 * Date: 10/24/2023
 **/

//Colaborators:
//
public class Stack<T, E> {
    //instance data
    private StackNode topValue;
    private int size;

    //default constructors
    public Stack(){
        size = 0;
        topValue = new StackNode();
    }

    //Methods

    //add an element
    public void push(E element){
        StackNode newValue = new StackNode(element);

    }

    //remove and return the top element
    public T pop() {
        
    }


    public boolean isEmpty(){

    }


    public int size(){

    }

    //look at the top element without removing
    public T peek(){

    }


}
