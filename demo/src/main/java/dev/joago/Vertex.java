package dev.joago;

import java.util.List;

public class Vertex {

    private int index;
    private List<Vertex> connectedTo;

    public Vertex(int index, List<Vertex> connectedTo) {
        this.index = index;
        this.connectedTo = connectedTo;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public List<Vertex> getConnectedTo() {
        return connectedTo;
    }

    public void setConnectedTo(List<Vertex> connectedTo) {
        this.connectedTo = connectedTo;
    }

    @Override
    public String toString() {
        return "Vertex [index=" + index + "]";
    }

}