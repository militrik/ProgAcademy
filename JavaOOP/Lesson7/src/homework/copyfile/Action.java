package homework.copyfile;

import java.util.Arrays;

public class Action {


    private boolean turn = false;
    private boolean stop = false;

    private BufferData bufferData;

    public Action() {
        super();
    }

    public BufferData getValue() {
        //System.out.println(bufferData.getReadBytes() + "<==" + Arrays.toString(bufferData.getBuffer()));
        return bufferData;
    }

    public void setValue(BufferData bufferData) {
        this.bufferData = bufferData;
        //System.out.println(this.bufferData.getReadBytes() + "==>" + Arrays.toString(this.bufferData.getBuffer()));
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }
}

class BufferData {
    private int readBytes;
    private byte[] buffer;

    public BufferData(int readBytes, byte[] buffer) {
        this.readBytes = readBytes;
        this.buffer = buffer;
    }

    public int getReadBytes() {
        return readBytes;
    }

    public void setReadBytes(int readBytes) {
        this.readBytes = readBytes;
    }

    public byte[] getBuffer() {
        return buffer;
    }

    public void setBuffer(byte[] buffer) {
        this.buffer = buffer;
    }
}