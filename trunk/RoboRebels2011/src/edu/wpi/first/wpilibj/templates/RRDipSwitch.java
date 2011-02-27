/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 *
 * @author dward
 *
 * Represents a Dip Switch connected via DigitalInputs
 */
public class RRDipSwitch {

    private     int                 m_numberOfDipSwitches;
    private     DigitalInput        m_dipSwitches[];

    public RRDipSwitch( int diChannelStart, int diChannelEnd )
    {
        m_numberOfDipSwitches = diChannelEnd - diChannelStart + 1;
        m_dipSwitches = new DigitalInput[m_numberOfDipSwitches];

        //for ( int i = 0)
    }
}
