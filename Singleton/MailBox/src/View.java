public class View extends MailBox implements IFirstView, ISecondView, IThirdView {

    // Singleton yapımız
    private static View view;

    private View() {
    }

    public static View getObj(){

        if(view == null){

            view = new View();

        }

        return view;

    }

    @Override
    public void firstView(View view) {

        view.setMailBoxPosition("Sol");
        view.setContentsPosition("Sağ Alt");
        view.setTitlePosition("Sağ Üst");

        view.setMailBoxHeight(500);
        view.setContentsHeight(250);
        view.setTitleHeight(250);

        view.setMailBoxWidth(200);
        view.setContentsWidth(400);
        view.setTitleWidth(400);

    }

    @Override
    public void secondView(View view) {

        view.setMailBoxPosition("Sol");
        view.setContentsPosition("Sağ");
        view.setTitlePosition("Orta");

        view.setMailBoxHeight(500);
        view.setContentsHeight(500);
        view.setTitleHeight(500);

        view.setMailBoxWidth(100);
        view.setContentsWidth(300);
        view.setTitleWidth(200);

    }

    @Override
    public void thirdView(View view) {

        view.setMailBoxPosition("Sol Üst");
        view.setContentsPosition("Alt");
        view.setTitlePosition("Sağ Üst");

        view.setMailBoxHeight(250);
        view.setContentsHeight(250);
        view.setTitleHeight(250);

        view.setMailBoxWidth(200);
        view.setContentsWidth(600);
        view.setTitleWidth(400);

    }



    public String show(View view) {
        return  "### VIEWS ### \n" +
                "Mail Box Position = " + view.getMailBoxPosition() + "\n"+
                "Title Position = " + view.getTitlePosition() + '\n' +
                "Contents Position = " + view.getContentsPosition() + '\n' +
                "Mail Box Height = " + view.getMailBoxHeight() + '\n' +
                "Mail Box Width = " + view.getMailBoxWidth() + '\n' +
                "Title Height = " + view.getTitleHeight() + '\n' +
                "Title Width = " + view.getTitleWidth() + '\n' +
                "Contents Height = " + view.getContentsHeight() + '\n' +
                "Contents Width = " + view.getContentsWidth();
    }
}
