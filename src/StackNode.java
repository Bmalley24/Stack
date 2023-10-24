public class StackNode {
    /**
     * StackNode
     * Author: Brandon Malley
     * Collaborator: Roan
     * Date: 10/24/2023
     **/

    public class Node<T, E> {
        private Node parentNode;
        private Node childNode;

        private T value;



        public Node() {//Empty Consructor
            parentNode = null;
            childNode = null;
            value = null;

        }
        public Node(T data){ // 1 imput Constructor
            value = data;
            parentNode = null;
            childNode = null;

        }

        public Node (T data, Node node1, Node node2) { // 3 inputConstructor
            parentNode = node1;
            childNode = node2;
            value = data;
        }

        //Accessors
        public Node getParentNode() {
            return parentNode;
        }

        public Node getChildNode() {
            return childNode;
        }

        public T getValue() {
            return value;
        }

        //Mutators
        public void setParentNode(Node newNode){
            parentNode = (newNode);
        }
        public void setChildNode(Node newNode){
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
        public boolean booleanEquals(Node a) {
            if (value.equals(a.getValue())){
                return true;
            } else{
                return false;
            }

        }
    }

}


