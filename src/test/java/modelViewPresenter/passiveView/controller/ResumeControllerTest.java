package modelViewPresenter.passiveView.controller;

import jdk.jfr.Description;
import org.example.modelViewPresenter.passiveView.controller.ResumeController;
import org.example.modelViewPresenter.passiveView.domain.Game;
import org.example.modelViewPresenter.passiveView.view.ViewFactory;
import org.example.modelViewPresenter.passiveView.view.console.ResumeView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ResumeControllerTest {
    @InjectMocks
    private ResumeController resumeController;
    @Mock
    private ResumeView resumeView;
    @Mock
    private ViewFactory viewFactory;
    @Mock
    private Game game;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @Description("Given a resume view (doc) read return false method, check if resume controller (sut) return false as well")
    public void testGivenFalseReadResumeViewCheckControlReturnFalse() {
        when(this.viewFactory.createResumeView()).thenReturn(this.resumeView);
        when((this.resumeView.read())).thenReturn(false);
        // doNothing().when(this.game).reset(); // TODO why this is not needed and is not compiling?

        assertThat(this.resumeController.control(), is(false));
    }

    @Test
    @Description("Given a resume view (doc) read return true method, check if resume controller (sut) return true as well")
    public void testGivenTrueReadResumeViewCheckControlReturnTrue() {
        when(this.viewFactory.createResumeView()).thenReturn(this.resumeView);
        when((this.resumeView.read())).thenReturn(true);

        assertThat(this.resumeController.control(), is(true));
    }
}
