package ovh.witucki.views.main;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import ovh.witucki.views.MainLayout;

@PageTitle("Main")
@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@AnonymousAllowed
public class MainView extends Composite<VerticalLayout> {

    public MainView() {
        VerticalLayout topRow = new VerticalLayout();
        H1 h1 = new H1();
        Paragraph topRowText = new Paragraph();

        HorizontalLayout mainContent = new HorizontalLayout();
        Image image = new Image();
        VerticalLayout movieDescriptionColumn = new VerticalLayout();
        Paragraph polishMovieTitle = new Paragraph();
        Paragraph englishMovieTitle = new Paragraph();
        Paragraph yearOfProduction = new Paragraph();
        HorizontalLayout rateRow = new HorizontalLayout();
        Icon rateIcon = VaadinIcon.STAR.create();
        H2 rate = new H2();

        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");

        topRow.setWidthFull();
        getContent().setFlexGrow(1.0,topRow);
        topRow.setWidth("100%");
        topRow.getStyle()
                .set("flex-grow", "1")
                .set("background-color", "orange");
        topRow.setAlignSelf(FlexComponent.Alignment.CENTER, topRowText, h1);

        mainContent.setPadding(true);
        mainContent.setWidthFull();
        mainContent.getStyle().set("flex-grow", "1");

        movieDescriptionColumn.setHeightFull();
        mainContent.setFlexGrow(1.0, movieDescriptionColumn);
        movieDescriptionColumn.setWidth("100%");
        movieDescriptionColumn.getStyle().set("flex-grow", "1");

        rateRow.setWidth("100%");
        rateRow.getStyle().set("flex-grow", "1");
        rateRow.setAlignItems(FlexComponent.Alignment.END);
        rateRow.setJustifyContentMode(FlexComponent.JustifyContentMode.START);
        rateRow.setAlignSelf(FlexComponent.Alignment.END, rate);
        h1.setText("MOVIE CLUB");
        h1.setWidth("max-content");

        topRowText.setText(
                "Witaj w najlepszej bazie filmów w sieci. Oceniaj i dyskutuj o " +
                        "najnowszych produkcjach i klasykach kina.");
        topRowText.setWidth("max-content");

        image.setSrc("images/poster-placeholder.png");

        polishMovieTitle.setText("Tytuł filmu");
        polishMovieTitle.getStyle()
                .set("font-size", "var(--lumo-font-size-xl)")
                .set("font-color", "orange")
                .setHeight("min-content");

        englishMovieTitle.setText("Angielski tytuł filmu");
        englishMovieTitle.setHeight("min-content");

        yearOfProduction.setText("1988");
        yearOfProduction.setHeight("min-content");

        rateIcon.setColor("orange");

        rate.setText("8.7");
        rate.setWidth("100%");

        getContent().add(topRow);
        getContent().add(mainContent);

        topRow.add(h1);
        topRow.add(topRowText);

        mainContent.add(image);
        mainContent.add(movieDescriptionColumn);

        movieDescriptionColumn.add(polishMovieTitle);
        movieDescriptionColumn.add(englishMovieTitle);
        movieDescriptionColumn.add(yearOfProduction);
        movieDescriptionColumn.add(rateRow);

        rateRow.add(rateIcon);
        rateRow.add(rate);
    }
}
