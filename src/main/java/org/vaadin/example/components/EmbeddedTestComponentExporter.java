package org.vaadin.example.components;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.webcomponent.WebComponent;

//Hmm, just adding the exporter to the project seems to break the component on the client-side due to a client-side exception.

//Comment me out
public class EmbeddedTestComponentExporter {}

//Uncomment me
//public class EmbeddedTestComponentExporter extends WebComponentExporter<EmbeddedTestComponent> {
//
//    public EmbeddedTestComponentExporter() {
//        super("emb-test");
//    }
//
//    @Override
//    protected void configureInstance(WebComponent<EmbeddedTestComponent> webComponent, EmbeddedTestComponent embeddedTestComponent) {
//
//    }
//}