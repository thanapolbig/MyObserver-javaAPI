/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author sarun
 */
import java.util.Observable;
import java.util.Observer;
public class Senior implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(
                "(Senior) headquater is updated to "
                        + ((HeadQuater)o).getSomeData());
    }
}
