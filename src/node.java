/**
 * StackNode
 * Author: Brandon Malley
 * Collaborator: Roan
 * Date: 10/24/2023
 **/

public class node<T, E> {
    private node parentNode;
    private node childNode;

    private T value;
    private E eValue;



    public node() {//Empty Consructor
        parentNode = null;
        childNode = null;
        value = null;

    }
    public node(T data){ // 1 input Constructor
        value = data;
        parentNode = null;
        childNode = null;

    }

    public node(T data, node node1, node node2) { // 3 inputConstructor
        parentNode = node1;
        childNode = node2;
        value = data;
    }


    //Accessors
    public node getParentNode() {
        return parentNode;
    }

    public node getChildNode() {
        return childNode;
    }

    public T getValue() {
        return value;
    }

    //Mutators
    public void setParentNode(node newNode){
        parentNode = (newNode);
    }
    public void setChildNode(node newNode){
        childNode = (newNode);
    }
    public void setValue(T newValue){
        value = (newValue);
    }

    //toString method
    public String toString() {
        return "Node:" + value;
    }

    //boolean method
    public boolean booleanEquals(node a) {
        if (value.equals(a.getValue())){
            return true;
        } else{
            return false;
        }

    }
}