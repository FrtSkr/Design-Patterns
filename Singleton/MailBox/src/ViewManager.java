public class ViewManager {

    private final View view;

    public ViewManager() {
        view = View.getObj();
    }

    public void getView(int i){
        if(i == 1){
            view.firstView(this.view);
            System.out.println(view.show(this.view));
        }else if(i == 2){
            view.secondView(this.view);
            System.out.println(view.show(this.view));
        }else if(i == 3){
            view.thirdView(this.view);
            System.out.println(view.show(this.view));
        }else{
            System.out.println("Yanlış giriş.");
        }
    }

}
