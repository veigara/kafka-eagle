/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.kafka.eagle.api.sms;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.smartloli.kafka.eagle.api.mail.MailSenderInfo;
import org.smartloli.kafka.eagle.api.mail.MailServerInfo;
import org.smartloli.kafka.eagle.api.mail.MailUtils;
import org.smartloli.kafka.eagle.api.mail.SimpleMailSender;
import org.smartloli.kafka.eagle.api.util.AlertUtils;
import org.smartloli.kafka.eagle.api.util.MailFactoryUtils;
import org.smartloli.kafka.eagle.common.protocol.alarm.AlarmEmailJsonInfo;
import org.smartloli.kafka.eagle.common.util.KConstants;

/**
 * // NOTE
 *
 * @author smartloli.
 * <p>
 * Created by Nov 03, 2020
 */
public class TestMail {

    public static void main(String[] args) {
        String type = "Email";
        String url = "{\"host\":\"smtp.qq.com\",\"port\":\"587\",\"sa\":\"444058925@qq.com\",\"username\":\"峘能运营平台<444058925@qq.com>\",\"password\":\"bvffbotjvitzbibd\",\"enable_ssl\":false}";
        String msg = "这是一条发送邮件";
        String result = "";
        String address = "zhouhongxin@altener.cn;";
        com.alibaba.fastjson.JSONObject data = new com.alibaba.fastjson.JSONObject();
        data.put("address", address);
        data.put("msg", msg);
        data.put("title", KConstants.AlarmType.EMAIL_TEST_TITLE);
        result = AlertUtils.sendTestMsgByEmail(url, data);
        System.out.println(result);
    }
}
