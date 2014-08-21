

EglTemplateFactory factory = new EglTemplateFactory();

                IModel model = EmfModelFactory.getInstance().loadEmfModel("MyModel", "/tmp/my_model.ecore", EcorePackage.eNS_URI);
                factory.getContext().getModelRepository().addModel(model);

                EglTemplate template = factory.load("/tmp/my_template.egl");

                String result = template.process();
                System.out.println(result);
