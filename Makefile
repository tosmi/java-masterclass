.DEFAULT_GOAL: topic
TOPIC ?= ""
LOWER_TOPIC = $(shell echo $(TOPIC) | tr A-Z a-z)
ARCHETYPE_VERSION ?= 1.4.1

###############
# Help Target #
###############
.PHONY: help
help: ## Show this help screen
	@echo 'Usage: make <OPTIONS> ... <TARGETS>'
	@echo ''
	@echo 'Available targets are:'
	@echo ''
	@awk 'BEGIN {FS = ":.*##"; printf "\nUsage:\n  make \033[36m<target>\033[0m\n"} /^[a-zA-Z0-9_-]+:.*?##/ { printf "  \033[36m%-20s\033[0m %s\n", $$1, $$2 } /^##@/ { printf "\n\033[1m%s\033[0m\n", substr($$0, 5) } ' $(MAKEFILE_LIST)

################
# Create topic #
################
.PHONY: topic

topic: ## Create a new maven project for topic
ifeq ($(strip $(TOPIC)),)
	@echo "TOPIC needs to be defined"
	@exit 1
endif
	mvn archetype:generate -DgroupId=at.stderr.$(LOWER_TOPIC) -DartifactId=$(LOWER_TOPIC) -DarchetypeGroupId=at.stderr -DarchetypeArtifactId=archetype-simple -DarchetypeVersion=$(ARCHETYPE_VERSION)
