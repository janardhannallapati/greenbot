/*
 * Copyright 2019-2020 Vinay Lodha (https://github.com/vinay-lodha)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package greenbot.provider.aws.model;

import greenbot.rule.model.cloud.Resource;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vinay Lodha
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@SuperBuilder(toBuilder = true)
@SuppressWarnings("UnusedAssignment")
public class AutoScalingGroup extends Resource {
    private Integer minCapacity;
    private Integer maxCapacity;
    private Integer desiredCapacity;

    private boolean mixedInstancesPolicy;
    private Integer onDemandBaseCapacity;
    private Integer onDemandPercentageAboveBaseCapacity;
    @Builder.Default
    private List<String> lbNames = new ArrayList<>();
    @Builder.Default
    private List<String> targetGroups = new ArrayList<>();
}
