/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hu.nbtest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.net.URLEncoder;
import javax.swing.text.Document;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import javax.swing.text.JTextComponent;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.HtmlBrowser.URLDisplayer;

@ActionID(
        category = "DOM",
        id = "nl.hu.nbtest.AddLombokBasics"
)
@ActionRegistration(
        displayName = "#CTL_AddLombokBasics"
)
@ActionReferences({
    @ActionReference(path = "Menu/Source", position = 200)
    ,
  @ActionReference(path = "Shortcuts", name = "O-L")
})
@Messages("CTL_AddLombokBasics=LombokBasics")
public final class AddLombokBasics implements ActionListener {
    JTextComponent textComp;
    

    @Override
    public void actionPerformed(ActionEvent e) {
         //int msgType = NotifyDescriptor.INFORMATION_MESSAGE;
         //NotifyDescriptor d = new NotifyDescriptor.Message("Hallo", msgType);
         //DialogDisplayer.getDefault().notify(d);
         try {
        URLDisplayer.getDefault().showURL
           (new URL("https://projectlombok.org/"));
    } catch (Exception eee){
        return;//nothing much to do
    }
    }
}
