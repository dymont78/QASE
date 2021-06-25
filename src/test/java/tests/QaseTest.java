package tests;

import adapters.BaseAdapter;
import adapters.ProjectsAdapter;
import adapters.SuiteAdapter;
import objects.Project;
import objects.TestSuite;
import org.testng.annotations.Test;

public class QaseTest {

    @Test
    public void getAllProjectsTest(){
        new BaseAdapter().get("project");
    }

    @Test
    public void createProjectTest(){
        Project project = Project.builder()
                .title("QATDNEW")
                .code("QATDNEW")
                .description("TD Test project")
                .access("all")
                .group(null)
                .build();
        String createProjectCode = new ProjectsAdapter().create(project);
    }

    @Test
    public void createNewTestSuite(){
        TestSuite testSuite = TestSuite.builder()
                .tite("TDTestSuite")
                .parentId(null)
                .description("Suite description")
                .preconditions("Precondition")
                .build();
        new SuiteAdapter().create("QATDNEW", testSuite);
    }
}
