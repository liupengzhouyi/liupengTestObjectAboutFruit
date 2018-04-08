package JDBCObject;

import java.awt.*;

public class lpWlecomeWindow {
    public lpWlecomeWindow() {
        this.lpWlecomeFrame = new Frame() ;
        this.lpWlecomePanel01 = new Panel() ;
        this.lpWelcomeBorderLayout = new BorderLayout() ;
        lpWlecomeLayoout = new FlowLayout() ;
        this.lpWelcomeCText = new Panel() ;
        this.lpWelcomeLabel = new Label() ;
        lpWelcomePanelForButton = new Panel();
        lpButton01 = new Button("OK") ;
        lpButton02= new Button("Out") ;
    }

    public void createWindow() {
        this.lpWlecomeFrame.addWindowListener(new newWindow());
        this.lpWlecomeFrame.setSize(800, 500) ;
        this.lpWlecomePanel01.setLayout(lpWelcomeBorderLayout);
        lpWelcomeLabel.setText("Welcome to LaoWnag Shop ") ;
        lpWelcomeCText.setLayout(lpWlecomeLayoout);
        lpWelcomeCText.add(lpWelcomeLabel);
        lpWlecomePanel01.add(lpWelcomeCText, BorderLayout.CENTER) ;
        lpWelcomePanelForButton.setLayout(lpWlecomeLayoout);
        lpWelcomePanelForButton.add(lpButton02) ;
        lpWelcomePanelForButton.add(lpButton01) ;
        lpWlecomePanel01.add(lpWelcomePanelForButton, BorderLayout.SOUTH) ;
    }

    public void setVisitbleCantSee(){
        lpWlecomeFrame.add(lpWlecomePanel01);
        lpWlecomeFrame.setVisible(true);
    }

    private Frame lpWlecomeFrame ;
    private Panel lpWlecomePanel01 ;
    private FlowLayout lpWlecomeLayoout ;
    private BorderLayout lpWelcomeBorderLayout ;
    private Panel lpWelcomeCText ;
    private Label lpWelcomeLabel ;
    private Panel lpWelcomePanelForButton ;
    private Button lpButton01 ;
    private Button lpButton02 ;
}
