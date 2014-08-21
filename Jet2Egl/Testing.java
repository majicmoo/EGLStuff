import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.emf.ecore.EcorePackage;


class Testing {
    public static void main (String[] args) throws Exception{
        

        EglTemplateFactory factory = new EglTemplateFactory();

        IModel model = EmfModelFactory.getInstance().loadEmfModel("MyModel", new File("/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/tmp/comicBooks.model"), new File("/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/tmp/comicBooks.ecore"));
        factory.getContext().getModelRepository().addModel(model);

        EglTemplate template = factory.load("/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/egl/artists2.egl");
        
        for (ParseProblem i : template.getParseProblems()){
            System.out.println(i);
        }
        
        System.out.println("test\n");
        
        template.populate("argument", model.getAllOfKind("Artist").iterator().next());

        String result = template.process();
        System.out.println(result);
        }
}
