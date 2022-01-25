package org.vaadin.example.views;

import com.vaadin.flow.component.AbstractCompositeField;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class Login extends VerticalLayout {

    HorizontalLayout horizontalLayout= new HorizontalLayout();
    Login(){
        LoginForm loginForm = new LoginForm();
        horizontalLayout.add(loginForm);

        add(horizontalLayout);

        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

    }
}
