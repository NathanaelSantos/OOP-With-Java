package week5;

public class Stack {

    private Object[] elements;
    private int topo = 0;

    public Stack(int max) {
        elements = new Object[max];
    }

    public void pileUp(Object element){
        elements[topo] = element;
        topo++;
    }

    public Object unstack(){
        return elements[--topo];
    }

    public Object topOfThePile(){
        return elements[topo-1];
    }

    public int stackSize(){
        return topo;
    }


    public int getTopo() {
        return topo;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
