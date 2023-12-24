impl Solution {
    pub fn num_unique_emails(emails: Vec<String>) -> i32 {
        let mut unique_emails = std::collections::HashSet::new();
        for email in emails {
            let mut local_name = email.split("@").next().unwrap().to_string();
            local_name = local_name.replace(".", "");
            if let Some(index) = local_name.find("+") {
                local_name = local_name[..index].to_string();
            }
            let domain_name = email.split("@").last().unwrap().to_string();
            unique_emails.insert(format!("{}@{}", local_name, domain_name));
        }
        unique_emails.len() as i32   
    }
}