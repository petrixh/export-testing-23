package org.vaadin.example.components;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;

@Tag("emb-test")
public class EmbeddedTestComponent extends Div {

    public EmbeddedTestComponent() {
        add(new Text("Embedded Hello World"));
    }

}
