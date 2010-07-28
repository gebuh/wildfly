/**
 * 
 */
package org.jboss.as.model.socket;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;

/**
 * {@link InterfaceCriteria} that tests whether a given interface is a 
 * {@link NetworkInterface#isLoopback() loopback interface}
 * 
 * @author Brian Stansberry
 */
public class LoopbackInterfaceCriteria implements InterfaceCriteria {

    public static final LoopbackInterfaceCriteria INSTANCE = new LoopbackInterfaceCriteria();
    
    private LoopbackInterfaceCriteria() {}
    
    /**
     * {@inheritDoc}
     * 
     * @return <code>true</code> if <code>networkInterface</code> is a 
     *         {@link NetworkInterface#isLoopback() loopback interface}.
     */
    @Override
    public boolean isAcceptable(NetworkInterface networkInterface, InetAddress address) throws SocketException {
        
        return networkInterface.isLoopback();
    }

}
