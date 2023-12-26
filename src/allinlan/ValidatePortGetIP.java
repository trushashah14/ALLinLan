package allinlan;

import ipgroupchat.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import javax.swing.JComboBox;

public class ValidatePortGetIP {
    public static void addIp(JComboBox<String> combo) throws SocketException {
        Enumeration enumeration = null;
        try {
            enumeration = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e1) {
            e1.printStackTrace();
        }
      while(enumeration.hasMoreElements()) {
            NetworkInterface e = (NetworkInterface) enumeration.nextElement();

            Enumeration a = e.getInetAddresses();
            while (a.hasMoreElements()) {
                InetAddress ipaddr = (InetAddress) a.nextElement();
                String getHostAddress = ipaddr.getHostAddress();

                if (checkIPv4(getHostAddress)&&(getHostAddress.equals("127.0.0.1")==false)) {
                    combo.addItem(ipaddr.getHostAddress() + " # " + e.getDisplayName());
                }
            }
        }
    }
    
    
    
    public static final boolean checkIPv4(final String ip) {
        boolean isIPv4;
        try {
            final InetAddress inet = InetAddress.getByName(ip);
            isIPv4 = inet.getHostAddress().equals(ip)
                    && inet instanceof Inet4Address;
        } catch (final UnknownHostException e) {
            isIPv4 = false;
        }
        return isIPv4;
    }
}
