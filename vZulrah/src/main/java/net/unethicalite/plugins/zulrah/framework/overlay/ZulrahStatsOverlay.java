package net.unethicalite.plugins.zulrah.framework.overlay;

import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.unethicalite.plugins.zulrah.vZulrahPlugin;

import javax.inject.Inject;
import java.awt.*;

public class ZulrahStatsOverlay extends OverlayPanel
{
    private final vZulrahPlugin plugin;

    @Inject
    private ZulrahStatsOverlay(vZulrahPlugin plugin)
    {
        super(plugin);
        setPosition(OverlayPosition.TOP_LEFT);
        setPriority(OverlayPriority.LOW);
        this.plugin = plugin;
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        ZulrahSession session = plugin.getSession();

        panelComponent.getChildren().add(LineComponent.builder()
                .left("vZulrah | By vPlugins")
                .build());

        panelComponent.getChildren().add(LineComponent.builder()
                .left("")
                .build());

        panelComponent.getChildren().add(LineComponent.builder()
                .left("Total KC:")
                .right(Integer.toString(session.getKills()))
                .build());

        panelComponent.getChildren().add(LineComponent.builder()
                .left("Session Time: ")
                .right(session.getElapsedTime())
                .build());

        panelComponent.getChildren().add(LineComponent.builder()
                .left("Status: ")
                .right(session.getCurrentTask())
                .build());

        return super.render(graphics);
    }
}
