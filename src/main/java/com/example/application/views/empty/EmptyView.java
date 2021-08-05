package com.example.application.views.empty;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("Empty")
@Route(value = "empty", layout = MainLayout.class)
@AnonymousAllowed
public class EmptyView extends Div {

    public EmptyView() {
        addClassName("empty-view");
        add(new Text("Content placeholder"));
    }

}
