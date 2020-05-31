/*
 * Copyright 2020 Vinay Lodha (https://github.com/vinay-lodha)
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
package greenbot.main.terraform;

import com.microsoft.terraform.TerraformClient;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.File;

/**
 * @author Vinay Lodha
 */
@Slf4j
public class TerraformUtils {

    @SneakyThrows
    public static void apply(String path) {
        try (TerraformClient client = new TerraformClient()) {
            client.setOutputListener(System.out::println);
            client.setErrorListener(System.err::println);

            client.setWorkingDirectory(new File(path));
            client.plan().get();
            client.apply().get();
            log.info("Terraform apply done for plan {}", path);
        }
    }

    @SneakyThrows
    public static void destroy(String path) {
        try (TerraformClient client = new TerraformClient()) {
            client.setOutputListener(System.out::println);
            client.setErrorListener(System.err::println);

            client.setWorkingDirectory(new File(path));
            client.destroy().get();
            log.info("Terraform destroy done for plan {}", path);
        }
    }

}
