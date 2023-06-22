# Good Style

## Source code commenting

Good source code commenting is an essential practice in software development that involves adding human-readable explanations and clarifications within the source code. 

- **Purpose and overview:** Begin each file or function with a comment that describes its purpose, inputs, outputs, and any relevant contextual information. This helps developers quickly understand the role of the code.

- **High-level algorithmic explanation:** For complex functions or algorithms, provide a high-level overview of the logic and approach used. This helps readers grasp the overall strategy before delving into the details.

- **Inline comments:** Place comments within the code to explain complex or non-intuitive sections, provide insights into the reasoning behind the code, or describe any potential pitfalls or caveats. Avoid stating the obvious and focus on clarifying the intent or any important details.

- **Clear and concise:** Keep your comments concise, using plain language and simple explanations. Avoid unnecessary jargon or complex technical terms that may confuse readers.

- **Update comments with code changes:** Whenever you modify code, make sure to review and update any relevant comments accordingly. Outdated comments can mislead other developers and lead to confusion.

- **Use proper grammar and formatting:** Maintain a consistent style and formatting for your comments to enhance readability. Use proper grammar, punctuation, and indentation. Additionally, consider using formatting conventions, such as Markdown or Doxygen, to add structure and improve the visual appearance of your comments.

- **Avoid redundant comments:** Be mindful of duplicating information that is already evident from the code itself. Comments should provide additional insights or explanations that cannot be easily inferred from the code alone.

- **Focus on why, not what:** Instead of solely describing what the code does, emphasize the reasons behind certain design choices or algorithms. Understanding the "why" is often more valuable than the "what" when maintaining or modifying code.

- **Comment non-obvious or complex code:** Prioritize commenting sections that may be difficult to understand at first glance. Focus on intricate algorithms, performance optimizations, workarounds, or any other non-trivial aspects of the code.

- **Avoid commenting obvious code:** Comments that simply restate what the code does without adding any value can clutter the codebase and become a maintenance burden. Aim for comments that provide insights beyond what is immediately apparent from the code itself.

Remember, while comments are essential, they should not be a substitute for writing clear, self-explanatory code. Strive for code that is expressive, modular, and follows best practices to minimize the need for excessive commenting.

## Good git commit messages

- **Separate subject from the body:** Start with a succinct subject line (50 characters or less) that summarizes the main purpose of the commit. Leave a blank line after the subject and provide a more detailed explanation in the commit body.

- **Use the imperative mood:** Write the subject line in the imperative mood, as if you are giving a command. Start with a verb that indicates what the commit does. For example, use "Add," "Fix," "Update," "Refactor," etc.

- **Be specific and descriptive:** Provide clear and concise information about the changes introduced by the commit. Mention the affected files, modules, or components. Avoid vague or generic descriptions.

- **Limit the subject line length:** Keep the subject line short, preferably within 50 characters. This helps when viewing commit logs and makes it easier to scan and understand changes quickly.

- **Wrap the body at 72 characters:** If the commit body is necessary, wrap lines at 72 characters. This convention makes reading commit messages in various tools or interfaces more convenient.

- **Provide context and motivation:** In the commit body, explain the reasons behind the changes and provide relevant contextual information. This helps other developers understand the motivation behind the commit and its impact on the codebase.

- **Focus on "what" and "why," not "how":** The commit message should primarily address what has changed and why it was necessary. Avoid going into excessive detail about how the changes were implemented, as this should ideally be reflected in the code itself.

- **Reference relevant issues:** If your project uses an issue tracking system, consider referencing the relevant issue or feature request number in the commit message. This helps establish a connection between the commit and the larger context of the project.

- **Proofread and use proper grammar:** Treat your commit messages like any other form of professional communication. Proofread them for typos, grammar errors, and clarity. Using correct punctuation and capitalization enhances readability.

- **Commit often and logically:** Break your changes into logical, self-contained commits. Each commit should represent a single cohesive change or a set of related changes. Avoid bundling unrelated modifications into a single commit.