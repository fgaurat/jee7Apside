/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclient;

import com.dmr.wsclient.ProjectsWebService_Service;
import com.dmr.wsclient.ProjectsWebService;

/**
 *
 * @author fgaurat
 */
public class JavaWSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProjectsWebService_Service ws_service = new ProjectsWebService_Service();
        ProjectsWebService ws=ws_service.getProjectsWebServicePort();
        
        System.out.println(ws.find(2).getName()); 
        
        
    }
    
}
