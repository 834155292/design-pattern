package com.zboy.example.structural.adapter.example06;


public interface MouseListener {

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     */
    void mouseClicked(MouseEvent e);

    /**
     * Invoked when a mouse button has been pressed on a component.
     */
    void mousePressed(MouseEvent e);

    /**
     * Invoked when a mouse button has been released on a component.
     */
    void mouseReleased(MouseEvent e);

    /**
     * Invoked when the mouse enters a component.
     */
    void mouseEntered(MouseEvent e);

    /**
     * Invoked when the mouse exits a component.
     */
    void mouseExited(MouseEvent e);
}
