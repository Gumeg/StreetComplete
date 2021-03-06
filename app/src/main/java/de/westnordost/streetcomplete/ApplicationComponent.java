package de.westnordost.streetcomplete;

import javax.inject.Singleton;

import dagger.Component;
import de.westnordost.streetcomplete.data.DbModule;
import de.westnordost.streetcomplete.data.OsmModule;
import de.westnordost.streetcomplete.data.QuestChangesUploadService;
import de.westnordost.streetcomplete.data.download.QuestDownloadService;
import de.westnordost.streetcomplete.data.meta.MetadataModule;
import de.westnordost.streetcomplete.data.osm.upload.ChangesetAutoCloserService;
import de.westnordost.streetcomplete.oauth.OAuthModule;
import de.westnordost.streetcomplete.oauth.OsmOAuthDialogFragment;
import de.westnordost.streetcomplete.quests.AbstractQuestAnswerFragment;
import de.westnordost.streetcomplete.quests.QuestModule;
import de.westnordost.streetcomplete.quests.opening_hours.AddOpeningHoursForm;
import de.westnordost.streetcomplete.quests.road_name.AddRoadNameForm;
import de.westnordost.streetcomplete.quests.note_discussion.NoteDiscussionForm;
import de.westnordost.streetcomplete.settings.SettingsActivity;
import de.westnordost.streetcomplete.settings.SettingsFragment;
import de.westnordost.streetcomplete.statistics.AnswersCounter;
import de.westnordost.streetcomplete.tangram.QuestsMapFragment;
import de.westnordost.streetcomplete.util.SerializedSavedState;

@Singleton
@Component(modules = {ApplicationModule.class, OAuthModule.class, OsmModule.class, QuestModule.class,
		DbModule.class, MetadataModule.class})
public interface ApplicationComponent
{
	void inject(MainActivity mainActivity);
	void inject(NoteDiscussionForm noteDiscussionForm);
	void inject(SerializedSavedState tSerializedSavedState);

	void inject(QuestChangesUploadService questChangesUploadService);
	void inject(QuestDownloadService questChangesDownloadService);
	void inject(ChangesetAutoCloserService changesetAutoCloserService);

	void inject(SettingsFragment settingsFragment);
	void inject(SettingsActivity settingsActivity);

	void inject(AnswersCounter answersCounter);

	void inject(AddOpeningHoursForm addOpeningHoursForm);
	void inject(AddRoadNameForm addRoadNameForm);

	void inject(OsmOAuthDialogFragment osmOAuthDialogFragment);

	void inject(AbstractQuestAnswerFragment abstractQuestAnswerFragment);

	void inject(QuestsMapFragment questsMapFragment);
}
