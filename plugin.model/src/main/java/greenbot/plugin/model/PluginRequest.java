package greenbot.plugin.model;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PluginRequest {
	private final List<ConfigParam> configParams;
}
