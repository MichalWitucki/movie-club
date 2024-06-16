package ovh.views.main;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import ovh.views.MainLayout;

@PageTitle("Main")
@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@AnonymousAllowed
public class MainView extends Composite<VerticalLayout> {

    public MainView() {
        VerticalLayout topRow = new VerticalLayout();
        H1 h1 = new H1();
        Paragraph textSmall = new Paragraph();

        VerticalLayout mainContent = new VerticalLayout();

        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        topRow.setWidthFull();
        getContent().setFlexGrow(1.0, topRow);
        topRow.setWidth("100%");
        topRow.getStyle()
                .set("flex-grow", "1")
                .set("background-color", "orange");
        h1.setText("MOVIE CLUB");
        h1.setWidth("max-content");
        textSmall.setText(
                "Witaj w najlepszej bazie filmów w sieci. Oceniaj i dyskutuj o " +
                        "najnowszych produkcjach i klasykach kina.");
        textSmall.setWidth("max-content");
        topRow.setAlignSelf(FlexComponent.Alignment.CENTER, textSmall, h1);
        getContent().add(topRow);
        getContent().add(mainContent);
        topRow.add(h1);
        topRow.add(textSmall);



        Image image = new Image("images/poster-placeholder.png", "Poster placeholder");
        mainContent.add(image);
    }
}
